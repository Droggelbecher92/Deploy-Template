# Template for deployment


With this template, you are set to deploy your application to Heroku.
I´m using a Spring backend, React TS Frontend with MongoDB database.

## Try it out
- Standard react starting-page: https://kevinowens.herokuapp.com/
- Simple DB- request to save new Document and show all Documents: https://kevinowens.herokuapp.com/api
  (if you count the items, you know how many people visited the site :D)

## - What you need:

- [Heroku account](https://www.heroku.com/)
- [MongoDB Atlas](https://www.mongodb.com/atlas/database)

## - What to do:

- Clone this Repo and connect it with a new Repo of yours(you can delete the .git Folder and make a new git init).
- Install or sign up to Heroku and MongoDB using the Links above.


- MongoDB Atlas:
    - create a Cluster for your App (check the pricing, there is a free tier)
    - After you created it, use the connect button => connect your application
      => java/current version => copy the connection string
- Let´s head to Heroku:
    - Create an App for your application
    - Head to settings and reveal `Config Vars`
    - Add the Key `URI` and as Value paste in your connection string (replace user
      and password with your values)
    - Since we are already on Heroku, we need some kind of authentication for
      GitHub, in this case an API-Key. We can generate our API-Key in Heroku by clicking the
      User-icon (top-right) => Account settings => scroll down untill you see API-Key
    - Either generate or copy your API-Key.
    - Thats all you have to do on Heroku. Everything else is done by the CI in combination with the API-Key.
- Github:
    - We have save this API-Key in our Repo, to Login to Heroku.
    - Go to your Repo => Settings => Secrets => Actions => New Repository Secret
    - Save your API-Key as `HEROKU_API_KEY`, save, and now GitHub and Heroku can communicate.

## - What to change:

- pom.xml:
  - change the `finalName` inside the tag to your Appname.
  - You can change the groupId if you like.

- Github Action:
  - All points of change are marked inside the action.

- Dockerfile:
  - Please change the Label :D
  - The .jar name should be changed to the same name, as in the pom.xml under `finalName` (at three places, you´ll manage to do it!)

- application.properties:
  - You can change the DB name for your local MongoDB here.

- You can remove all Packages in the backend, they are just an example for the DB connection.(Maybe consider leaving the `ReactRouterFix)

## - Problems
- If you encounter any problems using this template, please let me know by stating an issue on GitHub.
