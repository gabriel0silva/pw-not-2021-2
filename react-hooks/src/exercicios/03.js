import * as React from 'react'

/*function Name({name, onNameChange}) {
  return (
    <div>
      <label htmlFor="name">Name: </label>
      <input id="name" value={name} onChange={onNameChange} />
    </div>
  )
}*/

function Name() {
  const [ name, setName ] = React.useState('')
  return (
    <div>
      <label htmlFor="name">Name: </label>
      <input id="name" value={name} onChange={event => setName(event.target.value)} />
    </div>
  )
}

// 🐨 accept `animal` and `onAnimalChange` props to this component
function FavoriteAnimal({animal, onAnimalChange}) {
  return (
    <div>
      <label htmlFor="animal">Favorite Animal: </label>
      <input
        id="animal"
        value={animal}
        onChange={onAnimalChange}
      />
    </div>
  )
}

// 🐨 uncomment this
function Display({name, animal}) {
   return <div>{`Your favorite animal is: ${animal}!`}</div>
}


export default function Exercicio03() {
  // 🐨 add a useState for the animal
  // const [name, setName] = React.useState('')
  const [animal, setAnimal] = React.useState('')

  /*
    function handleNameChange(event) {
      setName(event.target.value)
    }

    function handleAnimalChange(event) {
      setAnimal(event.target.value)
    }
  */

  return (
    <form>
      <Name />
      {/* 🐨 pass the animal and onAnimalChange prop here (similar to the Name component above) */}
      <FavoriteAnimal animal={animal} onAnimalChange={event => setAnimal(event.target.value)} />
      {/* 🐨 pass the animal prop here */}
      <Display animal={animal} />
    </form>
  )
}